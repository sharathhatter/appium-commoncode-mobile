package com.mara.mentor.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FollowersPageObjects {


	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Followers']")
	@iOSFindBy(id = "Followers")
	public MobileElement FollowersScreenTitle;

	@AndroidFindBy(id="com.mara.maramentor:id/mentor_follow_button")
	public MobileElement FOLLOWBTN;
}
