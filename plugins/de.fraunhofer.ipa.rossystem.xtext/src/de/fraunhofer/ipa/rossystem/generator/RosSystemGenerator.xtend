/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.generator

import componentInterface.ComponentInterface
import componentInterface.RosPublisher
import componentInterface.RosServiceClient
import componentInterface.RosServiceServer
import componentInterface.RosSubscriber
import java.util.ArrayList
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import rossystem.RosSystem

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String CM_CONFIGURATION = "CM_CONFIGURATION"
	public final static String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"
	

	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration cm_config = new OutputConfiguration(CM_CONFIGURATION)
		cm_config.setDescription("CM_CONFIGURATION");
		cm_config.setOutputDirectory("./components/");
		cm_config.setOverrideExistingResources(true);
		cm_config.setCreateOutputDirectory(true);
		cm_config.setCleanUpDerivedResources(false);
		cm_config.setSetDerivedProperty(false);
		var OutputConfiguration default_config = new OutputConfiguration(DEFAULT_OUTPUT)
		default_config.setDescription("DEFAULT_OUTPUT");
		default_config.setOutputDirectory("./src-gen/");
		default_config.setOverrideExistingResources(true);
		default_config.setCreateOutputDirectory(true);
		default_config.setCleanUpDerivedResources(false);
		default_config.setSetDerivedProperty(false);
		return newHashSet(cm_config, default_config)
	}
}

class RosSystemGenerator extends AbstractGenerator {

	String package_name	
	String package_impl
	Object artifact_name
	String artifact_impl
	
	boolean PackageSet
	
	boolean ArtifactSet

	List<String> ListInterfaceDef

	List<RosPublisher> pubs
	List<RosSubscriber> subs
	List<RosServiceServer> svrs
	List<RosServiceClient> svrc
	
	int count_pub
	int count_sub
	int count_srvc
	int count_srvs
	
	String node_impl
	
	String node_name
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName()+".launch",system.compile_tolaunch)
				}
	
		for (system : resource.allContents.toIterable.filter(RosSystem)){
				fsa.generateFile(system.getName()+".componentinterface",CustomOutputProvider::CM_CONFIGURATION,system.compile_toComponentInterface)
				}
			}
	
	
	def compile_tolaunch(RosSystem system) '''«init()»
<?xml version="1.0"?>
<launch>
	«FOR component:system.rosComponent»
		«FOR rosPublisher:component.rospublisher»
				«IF component.hasNS»
				«IF !rosPublisher.name.equals(compile_topic_name(rosPublisher.publisher,component.get_ns))»
				<remap from=«compile_topic_name(rosPublisher.publisher,component.get_ns)» to=«rosPublisher.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosSubscriber:component.rossubscriber»
				«IF component.hasNS»
				«IF !rosSubscriber.name.equals(compile_topic_name(rosSubscriber.subscriber,component.get_ns))»
				<remap from=«compile_topic_name(rosSubscriber.subscriber,component.get_ns)» to=«rosSubscriber.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosServiceServer:component.rosserviceserver»
				«IF component.hasNS»
				«IF !rosServiceServer.name.equals(compile_service_name(rosServiceServer.srvserver,component.get_ns))»
				<remap from=«compile_service_name(rosServiceServer.srvserver,component.get_ns)» to=«rosServiceServer.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
		«FOR rosServiceClient:component.rosserviceclient»
				«IF component.hasNS»
				«IF !rosServiceClient.name.equals(compile_service_name(rosServiceClient.srvclient,component.get_ns))»
				<remap from=«compile_service_name(rosServiceClient.srvclient,component.get_ns)» to=«rosServiceClient.name» />
				«ENDIF»
				«ENDIF»
		«ENDFOR»
	«ENDFOR»
	«FOR component:system.rosComponent»

	<node pkg="«component.compile_pkg»" type="«component.compile_art»«init()»" name="«component.name»"«IF component.hasNS» ns="«component.get_ns»"«ENDIF» cwd="node" respawn="false" output="screen">«init()»
		«FOR rosPublisher:component.rospublisher»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.from.contains(rosPublisher)»
					«IF component.hasNS»
						«IF !topicConnection.topicName.equals(compile_topic_name(rosPublisher.publisher,component.get_ns))»
						<remap from="«rosPublisher.publisher.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
					«ELSE»					
						«IF !topicConnection.topicName.equals(rosPublisher.publisher.name)»
						<remap from="«rosPublisher.publisher.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosSubscriber:component.rossubscriber»
			«FOR topicConnection:system.topicConnections»
				«IF topicConnection.to.contains(rosSubscriber)»
					«IF component.hasNS»					
						«IF !topicConnection.topicName.equals(compile_topic_name(rosSubscriber.subscriber,component.get_ns))»
						<remap from="«rosSubscriber.subscriber.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
					«ELSE»
						«IF !topicConnection.topicName.equals(rosSubscriber.subscriber.name)»
						<remap from="«rosSubscriber.subscriber.name»" to="«topicConnection.topicName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosServiceServer:component.rosserviceserver»
			«FOR serviceConnection:system.serviceConnections»
				«IF serviceConnection.from.contains(rosServiceServer)»
					«IF component.hasNS»					
						«IF !serviceConnection.serviceName.equals(compile_service_name(rosServiceServer.srvserver,component.get_ns))»
						<remap from="«rosServiceServer.srvserver.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
					«ELSE»
						«IF !serviceConnection.serviceName.equals(rosServiceServer.srvserver.name)»
						<remap from="«rosServiceServer.srvserver.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR rosServiceClient:component.rosserviceclient»
			«FOR serviceConnection:system.serviceConnections»
				«IF serviceConnection.to.equals(rosServiceClient)»
					«IF component.hasNS»					
						«IF !serviceConnection.serviceName.equals(compile_service_name(rosServiceClient.srvclient,component.get_ns))»
						<remap from="«rosServiceClient.srvclient.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
					«ELSE»
						«IF !serviceConnection.serviceName.equals(rosServiceClient.srvclient.name)»
						<remap from="«rosServiceClient.srvclient.name»" to="«serviceConnection.serviceName»" />
						«ENDIF»	
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		«ENDFOR»
	</node>
	«ENDFOR»
</launch>
	'''

def List InterfaceDef(String name, String type){
	ListInterfaceDef = new ArrayList()
	ListInterfaceDef.add(name.replace("/","_"))
	ListInterfaceDef.add(name)
	ListInterfaceDef.add(type)
	return ListInterfaceDef
}
	
def compile_toComponentInterface(RosSystem system){
	pubs = new ArrayList()
	subs = new ArrayList()
	svrs = new ArrayList()
	svrc = new ArrayList()

		
	for (component: system.rosComponent){
		for ( pub:component.rospublisher){if (!pubs.contains(pub)) pubs.add(pub)}
		for ( sub:component.rossubscriber){if (!subs.contains(sub)) subs.add(sub)}
		for ( srv:component.rosserviceserver){if (!svrs.contains(srv)) svrs.add(srv)}
		for ( cl: component.rosserviceclient){if (!svrc.contains(cl)) svrc.add(cl)}
	}
	count_pub = pubs.length
	count_sub = subs.length
	count_srvs = svrs.length
	count_srvc = svrc.length

	
	'''
ComponentInterface { name «system.name»
«IF !pubs.empty»
RosPublishers{
	«FOR pub:pubs»
	«val count_pub=count_pub--»
	RosPublisher "«pub.name»" { RefPublisher "«pub.publisher.package_pub».«pub.publisher.artifact_pub».«pub.publisher.node_pub».«pub.publisher.name»"}«IF count_pub > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !subs.empty»
RosSubscribers{
	«FOR sub:subs»
	«val count_sub=count_sub--»
	RosSubscriber "«sub.name»" { RefSubscriber "«sub.subscriber.package_sub».«sub.subscriber.artifact_sub».«sub.subscriber.node_sub».«sub.subscriber.name»"}«IF count_sub > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !svrs.empty»
RosSrvServers{
	«FOR svrs:svrs»
	«val count_srvs=count_srvs--»
	RosServiceServer "«svrs.name»" { RefServer "«svrs.srvserver.package_srvserv».«svrs.srvserver.artifact_srvserv».«svrs.srvserver.node_srvserv».«svrs.srvserver.name»"}«IF count_srvs > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
«IF !svrc.empty»
RosSrvClients{
	«FOR svrc:svrc»
	«val count_srvc=count_srvc--»
	RosServiceClient "«svrc.name»" { RefClient "«svrc.srvclient.package_srvcli».«svrc.srvclient.artifact_srvcli».«svrc.srvclient.node_srvcli».«svrc.srvclient.name»"}«IF count_srvc > 1 »,«ENDIF»
	«ENDFOR»
	}
«ENDIF»
}
'''
}
	


def boolean hasNS(ComponentInterface component){
	if(!component.nameSpace.nullOrEmpty){
		return true;
	}else{
		return false
	}
}
def String get_ns(ComponentInterface component){
	return component.nameSpace.replaceFirst("/","");
}

def compile_pkg(ComponentInterface component) 
'''«IF !PackageSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !PackageSet»«Rospublisher.publisher.getPackage_pub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !PackageSet»«Rossubscriber.subscriber.getPackage_sub()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !PackageSet»«Rosserviceserver.srvserver.getPackage_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !PackageSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !PackageSet»«Rosserviceclient.srvclient.getPackage_srvcli()»«ENDIF»«ENDFOR»«ENDIF»'''
	
	def void init(){
		PackageSet=false
		ArtifactSet=false
	}
	def getPackage_pub(Publisher publisher){
		package_impl = publisher.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_sub(Subscriber subscriber){
		package_impl = subscriber.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_srvserv(ServiceServer serviceserver){
		package_impl = serviceserver.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage_srvcli(ServiceClient serviceclient){
		package_impl = serviceclient.eContainer.eContainer.eContainer.toString;
		return package_impl.getPackage;
	}
	def getPackage(String package_impl){
			package_name = package_impl.substring(package_impl.indexOf("name")+6,package_impl.length-1)
			PackageSet=true;
			return package_name;
	}
	
	def compile_art(ComponentInterface component) 	
'''«IF !ArtifactSet && !component.rospublisher.empty»«FOR Rospublisher:component.rospublisher»«IF !ArtifactSet»«Rospublisher.publisher.getArtifact_pub()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rossubscriber.empty»«FOR Rossubscriber:component.rossubscriber»«IF !ArtifactSet»«Rossubscriber.subscriber.getArtifact_sub()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceserver.empty»«FOR Rosserviceserver:component.rosserviceserver»«IF !ArtifactSet»«Rosserviceserver.srvserver.getArtifact_srvserv()»«ENDIF»«ENDFOR»«ELSEIF !ArtifactSet && !component.rosserviceclient.empty»«FOR Rosserviceclient:component.rosserviceclient»«IF !ArtifactSet»«Rosserviceclient.srvclient.getArtifact_srvcli()»«ENDIF»«ENDFOR»«ENDIF»'''
	def getArtifact_pub(Publisher publisher){
		artifact_impl = publisher.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_sub(Subscriber subscriber){
		artifact_impl = subscriber.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_srvserv(ServiceServer serviceserver){
		artifact_impl = serviceserver.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact_srvcli(ServiceClient serviceclient){
		artifact_impl = serviceclient.eContainer.eContainer.toString;
		return artifact_impl.getArtifact;
	}
	def getArtifact(String artifact_impl){
		artifact_name = artifact_impl.substring(artifact_impl.indexOf("name")+6,artifact_impl.length-1)
		ArtifactSet=true;
		return artifact_name;
	}
	
	def getNode_pub(Publisher publisher){
		node_impl = publisher.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_sub(Subscriber subscriber){
		node_impl = subscriber.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_srvserv(ServiceServer serviceserver){
		node_impl = serviceserver.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode_srvcli(ServiceClient serviceclient){
		node_impl = serviceclient.eContainer.toString;
		return node_impl.getNode;
	}
	def getNode(String node_impl){
		node_name = node_impl.substring(node_impl.indexOf("name")+6,node_impl.length-1)
		return node_name;
	}

	def compile_topic_name(Publisher publisher, String NS){
		return NS+"/"+publisher.name;
	}
	def compile_topic_name(Subscriber subscriber, String NS){
		return NS+"/"+subscriber.name;
	}
	def compile_service_name(ServiceServer serviceserver, String NS){
		return NS+"/"+serviceserver.name;
	}
	def compile_service_name(ServiceClient serviceclient, String NS){
		return NS+"/"+serviceclient.name;
	}
	

}
