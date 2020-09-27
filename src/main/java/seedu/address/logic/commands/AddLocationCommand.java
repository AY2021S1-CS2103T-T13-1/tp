package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.location.Location;

/**
 * Adds a location to the virus tracker.
 */
public class AddLocationCommand extends Command {

    public static final String COMMAND_WORD = "addLocation";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a location to the virus tracker. "
            + "Parameters: "
            + PREFIX_NAME + "NAME "
            + PREFIX_ADDRESS + "ADDRESS\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_NAME + "School of Computing "
            + PREFIX_ADDRESS + "NUS School of Computing COM1 13 Computing Dr, 117417 ";

    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "Add location command not implemented yet";

    public static final String MESSAGE_SUCCESS = "New location added: %1$s";
    public static final String MESSAGE_DUPLICATE_LOCATION = "This location already exists in the virus tracker.";

    private final Location toAdd;

    /**
     * Creates an AddLocationCommand to add the specified {@code Location}
     */
    public AddLocationCommand(Location location) {
        requireNonNull(location);
        toAdd = location;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        if (model.hasLocation(toAdd)) {
            throw new CommandException(MESSAGE_DUPLICATE_LOCATION);
        }

        model.addLocation(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, toAdd));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AddLocationCommand // instanceof handles nulls
                && toAdd.equals(((AddLocationCommand) other).toAdd));
    }
}
