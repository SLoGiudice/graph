package mono.com.syncfusion.charts;


public class SfChart_OnScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.charts.SfChart.OnScrollListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_OnScrollListener:(Lcom/syncfusion/charts/SfChart;Lcom/syncfusion/charts/ChartScrollEvent;)V:GetOnScrollListener_Lcom_syncfusion_charts_SfChart_Lcom_syncfusion_charts_ChartScrollEvent_Handler:Com.Syncfusion.Charts.SfChart/IOnScrollListenerInvoker, Syncfusion.SfChart.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Charts.SfChart+IOnScrollListenerImplementor, Syncfusion.SfChart.Android, Version=15.1451.0.33, Culture=neutral, PublicKeyToken=3d67ed1f87d44c89", SfChart_OnScrollListenerImplementor.class, __md_methods);
	}


	public SfChart_OnScrollListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfChart_OnScrollListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Charts.SfChart+IOnScrollListenerImplementor, Syncfusion.SfChart.Android, Version=15.1451.0.33, Culture=neutral, PublicKeyToken=3d67ed1f87d44c89", "", this, new java.lang.Object[] {  });
	}


	public void OnScrollListener (com.syncfusion.charts.SfChart p0, com.syncfusion.charts.ChartScrollEvent p1)
	{
		n_OnScrollListener (p0, p1);
	}

	private native void n_OnScrollListener (com.syncfusion.charts.SfChart p0, com.syncfusion.charts.ChartScrollEvent p1);

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
