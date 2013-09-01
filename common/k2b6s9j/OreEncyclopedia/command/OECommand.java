package k2b6s9j.OreEncyclopedia.command;

import java.util.ArrayList;
import java.util.List;

import k2b6s9j.OreEncyclopedia.OreEncyclopedia;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

public class OECommand implements ICommand
{
  private List aliases;
  public OECommand()
  {
    this.aliases = new ArrayList();
    this.aliases.add("oreencyclopedia");
    this.aliases.add("oe");
  }

  @Override
  public String getCommandName()
  {
    return "oreencyclopedia";
  }

  @Override
  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "oreencyclopedia <text>";
  }

  @Override
  public List getCommandAliases()
  {
    return this.aliases;
  }

  @Override
  public void processCommand(ICommandSender icommandsender, String[] astring)
  {
	  OreEncyclopedia.oeLog.info("Command called!");
  }

  @Override
  public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
  {
    return true;
  }

  @Override
  public List addTabCompletionOptions(ICommandSender icommandsender,
      String[] astring)
  {
    return null;
  }

  @Override
  public boolean isUsernameIndex(String[] astring, int i)
  {
    return false;
  }

  @Override
  public int compareTo(Object o)
  {
    return 0;
  }
}