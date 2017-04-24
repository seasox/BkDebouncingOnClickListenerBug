# BkDebouncingOnClickListenerBug
A test case for ButterKnife's DebouncingOnClickListener bug

If a button's performClick method is triggered programmatically in onResume, resulting in the containing fragment to be replaced, buttons will become dysfunctional.

Tested on LG Nexus 5X running Android 7.1.2.
