package cn.nukkit.command;

import cn.nukkit.InterruptibleThread;
import cn.nukkit.Server;
import cn.nukkit.event.server.ServerCommandEvent;
import jline.console.ConsoleReader;
import jline.console.CursorBuffer;

import java.io.IOException;

/**
 * author: MagicDroidX
 * Nukkit
 */
public class CommandReader extends Thread implements InterruptibleThread {

    private ConsoleReader reader;

    public static CommandReader instance;

    private CursorBuffer stashed;

    public static CommandReader getInstance() {
        return instance;
    }

    public CommandReader() {
        if (instance != null) {
            throw new RuntimeException("Command Reader is already exist");
        }
        try {
            this.reader = new ConsoleReader();
            reader.setPrompt("> ");
            instance = this;
        } catch (IOException e) {
            Server.getInstance().getLogger().error("Unable to start Console Reader");
        }
        this.setName("Console");
    }

    public String readLine() {
        try {
            reader.resetPromptLine("", "", 0);
            return this.reader.readLine("> ");
        } catch (IOException e) {
            Server.getInstance().getLogger().logException(e);
            return "";
        }
    }

    public void run() {
        Long lastLine = System.currentTimeMillis();
        while (true) {
            String line = readLine();

            if (!line.trim().equals("")) {
                //todo 将即时执行指令改为每tick执行
                try {
                    ServerCommandEvent event = new ServerCommandEvent(Server.getInstance().getConsoleSender(), line);
                    Server.getInstance().getPluginManager().callEvent(event);
                    if (!event.isCancelled()) {
                        Server.getInstance().dispatchCommand(event.getSender(), event.getCommand());
                    }

                } catch (Exception e) {
                    Server.getInstance().getLogger().logException(e);
                }

            } else if (System.currentTimeMillis() - lastLine <= 1) {
                try {
                    sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lastLine = System.currentTimeMillis();
        }
    }

    public void stashLine() {
        this.stashed = reader.getCursorBuffer().copy();
        try {
            reader.getOutput().write("\u001b[1G\u001b[K");
            reader.flush();
        } catch (IOException e) {
            // ignore
        }
    }

    public void unstashLine() {
        try {
            reader.resetPromptLine("> ", this.stashed.toString(), this.stashed.cursor);
        } catch (IOException e) {
            // ignore
        }
    }

    public void removePromptLine() {
        try {
            reader.resetPromptLine("", "", 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ConsoleReader getReader() {
        return reader;
    }
}
