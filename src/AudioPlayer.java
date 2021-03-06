/**
 * By Andrew Wilson.
 * code adapted from Oracle.
 */

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  /**
   * Constructor for Audio Player which takes in the product name and its specification.
   */

  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  /**
   * toString method which has rows for the audio specification and the type.
   */
  public String toString() {
    return super.toString() + "\n"
        + "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType;
  }
}