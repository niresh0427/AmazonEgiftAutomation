package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page_AmazonEgift;

public class StepDefenition_AmazonEgidt {
	
	@Given("User enter {string} on Google search")
	public void user_enter_on_google_search(String searchlink) {
		Page_AmazonEgift.search_google(searchlink);
	}

	@When("User click on search button")
	public void user_click_on_search_button() {
	    Page_AmazonEgift.click_search();
	}

	@When("User select the {string} link in the search results and click")
	public void user_select_the_link_in_the_search_results_and_click(String weblink) throws InterruptedException {
	    Page_AmazonEgift.get_link(weblink);
	}

	@When("User click on the Deliver To button")
	public void user_click_on_the_Deliver_To_button() throws InterruptedException {
	   Page_AmazonEgift.click_deliver();
	}

	@When("User select {string} as a country")
	public void user_select_as_a_country(String country) {
		Page_AmazonEgift.select_country(country);
	    
	}

	@When("User click done button")
	public void user_click_done_button() {
	    Page_AmazonEgift.click_done();
	}

	@Then("User verify Deliver to updated with {string} country name")
	public void user_verify_Deliver_to_updated_with_country_name(String dCountry) {
	    Page_AmazonEgift.verify_country(dCountry);
	}

	@Given("User enter {string} on Amazon search")
	public void user_enter_on_amazon_search(String searchtext) {
	    Page_AmazonEgift.search_amazon(searchtext);
	}

	@When("User click search button")
	public void user_click_search_button() {
	    Page_AmazonEgift.click_Asearch();
	}

	@When("User click on {string} button")
	public void user_click_on_button(String giftcard) throws InterruptedException {
		Page_AmazonEgift.click_result(giftcard);
	    
	}

	@When("User select a gift card")
	public void user_select_a_gift_card() throws InterruptedException {
	    Page_AmazonEgift.click_giftcard();
	}

	@Then("User verify the preview image should be updated with the selected design {string}")
	public void user_verify_the_preview_image_should_be_updated_with_the_selected_design(String design) throws InterruptedException {
	    Page_AmazonEgift.verify_giftcard(design);
	}

	@When("User select a different amount like {string}")
	public void user_select_a_different_amount_like(String amount) {
	    Page_AmazonEgift.select_amount(amount);
	}

	@Then("User verify preview image value should be updated with the new amount {string}")
	public void user_verify_preview_image_value_should_be_updated_with_the_new_amount(String string) {
	    Page_AmazonEgift.verify_amount();
	}

}
