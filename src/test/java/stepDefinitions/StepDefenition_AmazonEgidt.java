package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page_AmazonEgift;

public class StepDefenition_AmazonEgidt {

	@Given("User enter {string} on Google search")
	public void user_enter_on_google_search(String searchlink) {
		Page_AmazonEgift.startUp();
		Page_AmazonEgift.searchGoogle(searchlink);

	}

	@When("User click on search button")
	public void user_click_on_search_button() {
		Page_AmazonEgift.clickSearch();

	}

	@When("User select the {string} link in the search results and click")
	public void user_select_the_link_in_the_search_results_and_click(String weblink) throws InterruptedException {
		Page_AmazonEgift.getLink(weblink);

	}

	@When("User click on the Deliver To button")
	public void user_click_on_the_Deliver_To_button() throws InterruptedException {
		Page_AmazonEgift.clickDeliver();

	}

	@When("User select {string} as a country")
	public void user_select_as_a_country(String country) {
		Page_AmazonEgift.selectCountry(country);

	}

	@When("User click done button")
	public void user_click_done_button() {
		Page_AmazonEgift.clickDone();

	}

	@Then("User verify Deliver to updated with {string} country name")
	public void user_verify_Deliver_to_updated_with_country_name(String dCountry) {
		Page_AmazonEgift.verifyCountry(dCountry);

	}

	@Given("User enter {string} on Amazon search")
	public void user_enter_on_amazon_search(String searchtext) {
		Page_AmazonEgift.searchAmazon(searchtext);

	}

	@When("User click search button")
	public void user_click_search_button() {
		Page_AmazonEgift.clickAsearch();

	}

	@When("User click on {string} button")
	public void user_click_on_button(String giftcard) throws InterruptedException {
		Page_AmazonEgift.clickResult(giftcard);

	}

	@When("User select a gift card")
	public void user_select_a_gift_card() throws InterruptedException {
		Page_AmazonEgift.clickGiftcard();

	}

	@Then("User verify the preview image should be updated with the selected design {string}")
	public void user_verify_the_preview_image_should_be_updated_with_the_selected_design(String design)
			throws InterruptedException {
		Page_AmazonEgift.verifyGiftcard(design);

	}

	@When("User select a different amount like {string}")
	public void user_select_a_different_amount_like(String amount) {
		Page_AmazonEgift.selectAmount(amount);

	}

	@Then("User verify preview image value should be updated with the new amount {string}")
	public void user_verify_preview_image_value_should_be_updated_with_the_new_amount(String string)
			throws InterruptedException {
		Page_AmazonEgift.verifyAmount();
		Page_AmazonEgift.closeUp();

	}

}
