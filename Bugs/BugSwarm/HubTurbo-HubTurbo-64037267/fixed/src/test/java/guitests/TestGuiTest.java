package guitests;

import com.google.common.util.concurrent.SettableFuture;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.utils.FXTestUtils;
import ui.UI;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.loadui.testfx.controls.Commons.hasText;

public class TestGuiTest extends GuiTest {

    private static final SettableFuture<Stage> stageFuture = SettableFuture.create();

    protected static class TestUI extends UI {
        public TestUI() {
            super();
        }

        @Override
        public void start(Stage primaryStage) {
            super.start(primaryStage);
            stageFuture.set(primaryStage);
        }

        @Override
        public void quit() {
            super.quit();
        }
    }

    @Before
    @Override
    public void setupStage() throws Throwable {
        FXTestUtils.launchApp(TestUI.class, "--test=true"); // You can add start parameters here
        try {
            stage = targetWindow(stageFuture.get(25, TimeUnit.SECONDS));
            FXTestUtils.bringToFront(stage);
        } catch (Exception e) {
            throw new RuntimeException("Unable to show stage", e);
        }
    }

    @Override
    protected Parent getRootNode() {
        return stage.getScene().getRoot();
    }

    @Test
    public void testBadLogin() throws InterruptedException {
        TextField repoOwnerField = find("#repoOwnerField");
        doubleClick(repoOwnerField);
        type("HubTurbo").push(KeyCode.TAB);
        type("HubTurbo").push(KeyCode.TAB);
        type("test").push(KeyCode.TAB);
        type("test");
        click("Sign in");
        sleep(2000);
        assertNotNull(hasText("Failed to sign in. Please try again."));
    }
}
