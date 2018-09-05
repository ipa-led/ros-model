/**
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import ros.Node;
import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RosArtifactGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Node> _filter = Iterables.<Node>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Node.class);
    for (final Node node : _filter) {
      String _name = node.getName();
      String _plus = (_name + ".cpp");
      fsa.generateFile(_plus, this.compile(node));
    }
  }
  
  public CharSequence compile(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <ros/ros.h>");
    _builder.newLine();
    {
      EList<Publisher> _publisher = node.getPublisher();
      for(final Publisher pub : _publisher) {
        _builder.append("#include <");
        String _name = pub.getMessage().getPackage().getName();
        _builder.append(_name);
        _builder.append("/");
        String _name_1 = pub.getMessage().getName();
        _builder.append(_name_1);
        _builder.append(".h>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Subscriber> _subscriber = node.getSubscriber();
      for(final Subscriber sub : _subscriber) {
        _builder.append("#include <");
        String _name_2 = sub.getMessage().getPackage().getName();
        _builder.append(_name_2);
        _builder.append("/");
        String _name_3 = sub.getMessage().getName();
        _builder.append(_name_3);
        _builder.append(".h>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ServiceServer> _serviceserver = node.getServiceserver();
      for(final ServiceServer srvserver : _serviceserver) {
        _builder.append("#include <");
        String _name_4 = srvserver.getService().getPackage().getName();
        _builder.append(_name_4);
        _builder.append("/");
        String _name_5 = srvserver.getService().getName();
        _builder.append(_name_5);
        _builder.append(".h>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ServiceClient> _serviceclient = node.getServiceclient();
      for(final ServiceClient srvclient : _serviceclient) {
        _builder.append("#include <");
        String _name_6 = srvclient.getService().getPackage().getName();
        _builder.append(_name_6);
        _builder.append("/");
        String _name_7 = srvclient.getService().getName();
        _builder.append(_name_7);
        _builder.append(".h>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<ServiceServer> _serviceserver_1 = node.getServiceserver();
      for(final ServiceServer srvserver_1 : _serviceserver_1) {
        _builder.append("bool  ");
        String _name_8 = srvserver_1.getName();
        _builder.append(_name_8);
        _builder.append("_cb (");
        String _name_9 = srvserver_1.getService().getPackage().getName();
        _builder.append(_name_9);
        _builder.append("::");
        String _name_10 = srvserver_1.getService().getName();
        _builder.append(_name_10);
        _builder.append(" &req, ");
        String _name_11 = srvserver_1.getService().getPackage().getName();
        _builder.append(_name_11);
        _builder.append("::");
        String _name_12 = srvserver_1.getService().getName();
        _builder.append(_name_12);
        _builder.append(" &res){");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      EList<Subscriber> _subscriber_1 = node.getSubscriber();
      for(final Subscriber sub_1 : _subscriber_1) {
        _builder.append("void  ");
        String _name_13 = sub_1.getName();
        _builder.append(_name_13);
        _builder.append("_cb (const ");
        String _name_14 = sub_1.getMessage().getPackage().getName();
        _builder.append(_name_14);
        _builder.append("::");
        String _name_15 = sub_1.getMessage().getName();
        _builder.append(_name_15);
        _builder.append(" msg){}");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("int main(int argc, char **argv)");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ros::init(argc, argv, \"");
    String _name_16 = node.getName();
    _builder.append(_name_16, "  ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("ros::NodeHandle n;");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    {
      EList<Publisher> _publisher_1 = node.getPublisher();
      for(final Publisher pub_1 : _publisher_1) {
        CharSequence _compile = this.compile(pub_1);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Subscriber> _subscriber_2 = node.getSubscriber();
      for(final Subscriber sub_2 : _subscriber_2) {
        CharSequence _compile_1 = this.compile(sub_2);
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ServiceServer> _serviceserver_2 = node.getServiceserver();
      for(final ServiceServer srvserver_2 : _serviceserver_2) {
        CharSequence _compile_2 = this.compile(srvserver_2);
        _builder.append(_compile_2);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ServiceClient> _serviceclient_1 = node.getServiceclient();
      for(final ServiceClient srvclient_1 : _serviceclient_1) {
        CharSequence _compile_3 = this.compile(srvclient_1);
        _builder.append(_compile_3);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("  ");
    _builder.append("ros::spin();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Publisher pub) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("ros::Publisher ");
    String _name = pub.getName();
    _builder.append(_name, "  ");
    _builder.append("_pub = n.advertise<");
    String _name_1 = pub.getMessage().getPackage().getName();
    _builder.append(_name_1, "  ");
    _builder.append("::");
    String _name_2 = pub.getMessage().getName();
    _builder.append(_name_2, "  ");
    _builder.append(">(\"");
    String _name_3 = pub.getName();
    _builder.append(_name_3, "  ");
    _builder.append("\", 10);");
    return _builder;
  }
  
  public CharSequence compile(final Subscriber sub) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("ros::Subscriber ");
    String _name = sub.getName();
    _builder.append(_name, "  ");
    _builder.append(" = n.subscribe(\"");
    String _name_1 = sub.getName();
    _builder.append(_name_1, "  ");
    _builder.append("\", 10, ");
    String _name_2 = sub.getName();
    _builder.append(_name_2, "  ");
    _builder.append("_cb);");
    return _builder;
  }
  
  public CharSequence compile(final ServiceServer srvserver) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("ros::ServiceServer ");
    String _name = srvserver.getName();
    _builder.append(_name, "  ");
    _builder.append(" = n.advertiseService(\"");
    String _name_1 = srvserver.getName();
    _builder.append(_name_1, "  ");
    _builder.append("\", ");
    String _name_2 = srvserver.getName();
    _builder.append(_name_2, "  ");
    _builder.append("_cb);");
    return _builder;
  }
  
  public CharSequence compile(final ServiceClient srvclient) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("ros::ServiceClient ");
    String _name = srvclient.getName();
    _builder.append(_name, "  ");
    _builder.append(" = n.serviceClient<");
    String _name_1 = srvclient.getService().getPackage().getName();
    _builder.append(_name_1, "  ");
    _builder.append("::");
    String _name_2 = srvclient.getService().getName();
    _builder.append(_name_2, "  ");
    _builder.append(">(\"");
    String _name_3 = srvclient.getName();
    _builder.append(_name_3, "  ");
    _builder.append("\");");
    return _builder;
  }
}
