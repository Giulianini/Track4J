package track4j.core.view;

import com.jfoenix.controls.JFXDialog;

/**
 * Enum of predefined desctiption and titles for {@link JFXDialog}.
 */
public enum DialogsType {

    /**
     * Help {@link DialogsType}for help button.
     */
    HELP("DON'T WORRY WE CAN HELP YOU",
            "1) Click on the menu and select theory.\n" + "2) Click on practice and start exercice.\n"
                    + "3) Click on statistics and see your stats.\n" + "4) Only one player at time.\n" + "ENJOY!!!",
            DimDialogs.SMALL);
    private final String titolo;
    private final String descrizione;
    private final DimDialogs dim;

    DialogsType(final String title, final String description, final DimDialogs size) {
        this.titolo = title;
        this.descrizione = description;
        this.dim = size;
    }

    /**
     * Get the title {@link DialogsType}.
     *
     * @return the String title.
     */
    public String getTitle() {
        return this.titolo;
    }

    /**
     * Get the description {@link DialogsType}.
     *
     * @return the String description
     */
    public String getDescription() {
        return this.descrizione;
    }

    /**
     * Get the DimDialogs.
     *
     * @return the {@link DimDialogs}
     */
    public DimDialogs getDim() {
        return this.dim;
    }

    /**
     * Enum for text {@link DimDialogs}. You can set all the dimensions.
     *
     */
    public enum DimDialogs {
        /**
         * Dims.
         */
        BIG(3), MEDIUM(2), SMALL(1);

        private int dim;

        DimDialogs(final int size) {
            this.dim = size;
        }

        /**
         * Get the dim.
         *
         * @return the dim
         */
        public int getDim() {
            return this.dim;
        }
    }
}
