package stickman.config;

import org.json.simple.JSONObject;

/** The configuration containing all user-defined settings. */
public class LevelSettings {

  private JSONObject entityData;
  private double width;
  private double floorHeight;
  private double target;
  private double levels;

  public LevelSettings(JSONObject entityData, double width, double floorHeight, double target, double levels) {
    this.entityData = entityData;
    this.width = width;
    this.floorHeight = floorHeight;
    this.target = target;
    this.levels = levels;
  }

  /**
   * Get the stored Entity data.
   *
   * @return a JSONObject containing Entity data.
   */
  public JSONObject getEntityData() {
    return entityData;
  }

  /**
   * Get the level's floor height.
   *
   * @return the floor height.
   */
  public double getFloorHeight() {
    return floorHeight;
  }

  /**
   * Get the level's width.
   *
   * @return the width.
   */
  public double getWidth() {
    return width;
  }

  /**
   * Gets the level's target score.
   * @return
   */
  public double getTarget() {
    return target;
  }

  /**
   * Gets the number of levels.
   * @return
   */
  public double getLevels() {
    return levels;
  }
}
