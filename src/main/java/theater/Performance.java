package theater;

/**
 * Represents a performance of a play: identifies the play and the audience size.
 */
public class Performance {

    private final String playID;
    private final int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the ID of the play.
     *
     * @return the play ID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Returns the size of the audience.
     *
     * @return the audience size
     */
    public int getAudience() {
        return audience;
    }
}
