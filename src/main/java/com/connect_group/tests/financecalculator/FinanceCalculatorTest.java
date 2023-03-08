package com.connect_group.tests.financecalculator;

import com.connect_group.pages.financecalculator.FilterByPage;
import com.connect_group.pages.financecalculator.ModelSelectPage;
import com.connect_group.pages.financecalculator.PersonalisedQuotePage;
import com.connect_group.tests.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FinanceCalculatorTest extends BaseTest {

  private ModelSelectPage modelSelectPage;
  private FilterByPage filterByPage;
  private PersonalisedQuotePage personalisedQuotePage;

  @BeforeEach
  void setupAndNavigateToUrl() {
    modelSelectPage = new ModelSelectPage(driver);
    filterByPage = new FilterByPage(driver);
    personalisedQuotePage = new PersonalisedQuotePage(driver);

    open("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html");
  }

  @Test
  void ensureModelSelectPageIsPresent() {
    assertTrue(modelSelectPage.isInitialized());
  }

  // TODO: Complete the each of the tests under the "Tasks to Complete" section of the README.md


  @Test
  void selectAndChangeVehicle() {

    driver.findElement(By.xpath("(//div[@class='fc-nameplate__imageOverlay'])[2]")).click();
    driver.getCurrentUrl().equals("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html#/quote/l461_k23__4a8k7__a-d300_a-std_a-swb_sp2");
  driver.findElement(By.xpath("//span[normalize-space()='Change Vehicle']")).click();

  driver.findElement(By.xpath("//div[@class='QuickQuote']//div[2]//div[1]//div[1]//a[1]//span[1]//div[1]")).click();
  driver.getCurrentUrl().equals("https://www.landrover.co.uk/offers-and-finance/finance-calculator.html#/quote/l551_k235__4a8js__a-d163-m-fwd_a-evoque_a-swb_sp0");



  }
}