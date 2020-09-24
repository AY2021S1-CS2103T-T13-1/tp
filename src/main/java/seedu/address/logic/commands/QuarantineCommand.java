package seedu.address.logic.commands;

import static seedu.address.logic.parser.CliSyntax.PREFIX_QUARANTINE;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Changes the quarantine status of an existing person.
 */
public class QuarantineCommand extends Command {

    public static final String COMMAND_WORD = "quarantine";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Edits the quarantine status of the person identified "
            + "by the index number used in the last person listing.\n"
            + "Parameters: INDEX (must be a positive integer) "
            + PREFIX_QUARANTINE + "[QUARANTINE STATUS]\n"
            + "Example: " + COMMAND_WORD + " 1 "
            + PREFIX_QUARANTINE + "true";

    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "Quarantine command not implemented yet.";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        throw new CommandException(MESSAGE_NOT_IMPLEMENTED_YET);
    }
}
