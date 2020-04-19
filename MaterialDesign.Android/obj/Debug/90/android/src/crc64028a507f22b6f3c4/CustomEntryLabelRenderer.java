package crc64028a507f22b6f3c4;


public class CustomEntryLabelRenderer
	extends crc643f46942d9dd1fff9.EntryRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MaterialDesign.Droid.Renderers.CustomEntryLabelRenderer, MaterialDesign.Android", CustomEntryLabelRenderer.class, __md_methods);
	}


	public CustomEntryLabelRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == CustomEntryLabelRenderer.class)
			mono.android.TypeManager.Activate ("MaterialDesign.Droid.Renderers.CustomEntryLabelRenderer, MaterialDesign.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CustomEntryLabelRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == CustomEntryLabelRenderer.class)
			mono.android.TypeManager.Activate ("MaterialDesign.Droid.Renderers.CustomEntryLabelRenderer, MaterialDesign.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public CustomEntryLabelRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == CustomEntryLabelRenderer.class)
			mono.android.TypeManager.Activate ("MaterialDesign.Droid.Renderers.CustomEntryLabelRenderer, MaterialDesign.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
