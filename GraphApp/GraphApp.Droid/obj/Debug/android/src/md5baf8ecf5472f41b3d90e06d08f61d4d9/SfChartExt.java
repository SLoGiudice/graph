package md5baf8ecf5472f41b3d90e06d08f61d4d9;


public class SfChartExt
	extends com.syncfusion.charts.SfChart
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Syncfusion.SfChart.XForms.Droid.SfChartExt, Syncfusion.SfChart.XForms.Android, Version=15.1451.0.33, Culture=neutral, PublicKeyToken=null", SfChartExt.class, __md_methods);
	}


	public SfChartExt (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == SfChartExt.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfChart.XForms.Droid.SfChartExt, Syncfusion.SfChart.XForms.Android, Version=15.1451.0.33, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public SfChartExt (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == SfChartExt.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfChart.XForms.Droid.SfChartExt, Syncfusion.SfChart.XForms.Android, Version=15.1451.0.33, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public SfChartExt (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == SfChartExt.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfChart.XForms.Droid.SfChartExt, Syncfusion.SfChart.XForms.Android, Version=15.1451.0.33, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
