/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cse.designpattern.CommandPatternMKII.Multiple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 이승환
 */
public class RemoteControl {

    private static final int MAX_COMMANDS = 7;
    private List<Command> onCommands = new ArrayList<>();
    private List<Command> offCommands = new ArrayList<>();
    private Command undoCommand;

    public RemoteControl() {
        Command noCommand = new NoCommand();
        for (int i = 0; i < MAX_COMMANDS; i++) {
            onCommands.add(i, noCommand);
            offCommands.add(i, noCommand);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.set(slot, onCommand);
        offCommands.set(slot, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        onCommands.get(slot).execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands.get(slot).execute();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("\n------리모트 컨트롤------\n");
        for (int i = 0; i < MAX_COMMANDS; i++) {
            buf.append("[Slot ").append(i).append("]");
            buf.append(onCommands.get(i).getClass().getName()).append("   ");
            buf.append(offCommands.get(i).getClass().getName()).append("\n");
        }
        return buf.toString();
    }
}
