// Autogenerated Jamon proxy
// /Users/ljzh/projects/source/hbase/hbase-server/src/main/jamon/./org/apache/hadoop/hbase/tmpl/regionserver/ServerMetricsTmpl.jamon

package org.apache.hadoop.hbase.tmpl.regionserver;

// 25, 1
import java.util.*;
// 26, 1
import org.apache.hadoop.hbase.regionserver.HRegionServer;
// 27, 1
import org.apache.hadoop.hbase.io.ByteBuffAllocator;
// 28, 1
import org.apache.hadoop.hbase.ipc.MetricsHBaseServerWrapper;
// 29, 1
import org.apache.hadoop.hbase.regionserver.MetricsRegionServerWrapper;
// 30, 1
import org.apache.hadoop.hbase.util.Bytes;
// 31, 1
import org.apache.hadoop.hbase.HRegionInfo;
// 32, 1
import org.apache.hadoop.hbase.ServerName;
// 33, 1
import org.apache.hadoop.hbase.HBaseConfiguration;
// 34, 1
import org.apache.hadoop.hbase.protobuf.ProtobufUtil;
// 35, 1
import org.apache.hadoop.hbase.protobuf.generated.AdminProtos.ServerInfo;
// 36, 1
import org.apache.hadoop.hbase.protobuf.generated.ClusterStatusProtos.RegionLoad;
// 37, 1
import org.apache.hadoop.hbase.util.DirectMemoryUtils;
// 38, 1
import org.apache.hadoop.util.StringUtils.TraditionalBinaryPrefix;
// 39, 1
import java.lang.management.MemoryUsage;
// 40, 1
import org.apache.hadoop.hbase.io.util.MemorySizeUtil;

@org.jamon.annotations.Template(
  signature = "473F48EC2D8DCCE65C83743BC20F3D1E",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "mWrap", type = "MetricsRegionServerWrapper"),
    @org.jamon.annotations.Argument(name = "mServerWrap", type = "MetricsHBaseServerWrapper"),
    @org.jamon.annotations.Argument(name = "bbAllocator", type = "ByteBuffAllocator")})
public class ServerMetricsTmpl
  extends org.jamon.AbstractTemplateProxy
{
  
  public ServerMetricsTmpl(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  protected ServerMetricsTmpl(String p_path)
  {
    super(p_path);
  }
  
  public ServerMetricsTmpl()
  {
     super("/org/apache/hadoop/hbase/tmpl/regionserver/ServerMetricsTmpl");
  }
  
  public interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf
  {
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 20, 1
    public void setMWrap(MetricsRegionServerWrapper mWrap)
    {
      // 20, 1
      m_mWrap = mWrap;
    }
    public MetricsRegionServerWrapper getMWrap()
    {
      return m_mWrap;
    }
    private MetricsRegionServerWrapper m_mWrap;
    // 21, 1
    public void setMServerWrap(MetricsHBaseServerWrapper mServerWrap)
    {
      // 21, 1
      m_mServerWrap = mServerWrap;
    }
    public MetricsHBaseServerWrapper getMServerWrap()
    {
      return m_mServerWrap;
    }
    private MetricsHBaseServerWrapper m_mServerWrap;
    // 22, 1
    public void setBbAllocator(ByteBuffAllocator bbAllocator)
    {
      // 22, 1
      m_bbAllocator = bbAllocator;
    }
    public ByteBuffAllocator getBbAllocator()
    {
      return m_bbAllocator;
    }
    private ByteBuffAllocator m_bbAllocator;
  }
  @Override
  protected org.jamon.AbstractTemplateProxy.ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new ServerMetricsTmplImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final MetricsRegionServerWrapper mWrap, final MetricsHBaseServerWrapper mServerWrap, final ByteBuffAllocator bbAllocator)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, mWrap, mServerWrap, bbAllocator);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final MetricsRegionServerWrapper mWrap, final MetricsHBaseServerWrapper mServerWrap, final ByteBuffAllocator bbAllocator)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, mWrap, mServerWrap, bbAllocator);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final MetricsRegionServerWrapper mWrap, final MetricsHBaseServerWrapper mServerWrap, final ByteBuffAllocator bbAllocator)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setMWrap(mWrap);
    implData.setMServerWrap(mServerWrap);
    implData.setBbAllocator(bbAllocator);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}