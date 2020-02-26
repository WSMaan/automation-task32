package com.connect_group.tests.comparisontool;

import com.connect_group.pages.comparisontool.ComparisonToolPage;
import com.connect_group.tests.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ComparisonToolTest extends BaseTest {

  private ComparisonToolPage comparisonToolPage;

  @BeforeEach
  void navigateToURL() {
    comparisonToolPage = new ComparisonToolPage(driver);
    open("https://www.landrover.co.uk/comparison-tool/index.html");
  }

  @Test
  void ensureComparisonToolLoads() {
    assertTrue(comparisonToolPage.isInitialized());
  }

  // TODO: Complete the each of the tests under the "Tasks to Complete" section of the README.md
}