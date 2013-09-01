package k2b6s9j.OreEncyclopedia.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
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
	public String getCommandUsage(ICommandSender sender) {
		return "/" + this.getCommandName() + " <help|list|exchange>";
	}

  @Override
  public List getCommandAliases()
  {
    return this.aliases;
  }

  @Override
  public void processCommand(ICommandSender sender, String[] arguments)
  {
	  if (arguments.length <= 0)
			throw new WrongUsageException("Type '" + this.getCommandUsage(sender) + "' for help.");

		if (arguments[0].matches("help")) {
			sender.sendChatToPlayer(ChatMessageComponent.func_111066_d("Format: '" + this.getCommandName() + " <command> <arguments>'"));
			sender.sendChatToPlayer(ChatMessageComponent.func_111066_d("Available commands:"));
			sender.sendChatToPlayer(ChatMessageComponent.func_111066_d("- list : Lists all of the items belonging to an entry."));
			sender.sendChatToPlayer(ChatMessageComponent.func_111066_d("- exchange : Exchange the item being held for another in the same entry."));
			return;
		} else if (arguments[0].matches("list")) {
			sender.sendChatToPlayer(ChatMessageComponent.func_111066_d("Not yet implemented"));
			return;
		} else if (arguments[0].matches("exchange")) {
			sender.sendChatToPlayer(ChatMessageComponent.func_111066_d("Not yet implemented"));
			return;
		}

		throw new WrongUsageException(this.getCommandUsage(sender));
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