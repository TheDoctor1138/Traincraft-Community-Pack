package tcce.common.library;

import train.common.api.TrainSoundRecord;


public enum TCCEEnumSounds implements TrainSoundRecord {

	;

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
	 * 
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private TCCEEnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

    @Override
	public Class getEntityClass() {
		return entityClass;
	}

    @Override
	public String getHornString() {
        if (horn == null || horn.isEmpty() || horn.startsWith(TCCEInfo.resourceLocation + ":")) return horn;
		return TCCEInfo.resourceLocation + ":" + horn;
	}

    @Override
	public String getRunString() {
        if (run == null || run.isEmpty() || run.startsWith(TCCEInfo.resourceLocation + ":")) return run;
		return TCCEInfo.resourceLocation + ":" + run;
	}

    @Override
	public String getIdleString() {
        if (idle == null || idle.isEmpty() || idle.startsWith(TCCEInfo.resourceLocation + ":")) return idle;
		return TCCEInfo.resourceLocation + ":" + idle;
	}

    @Override
	public Float getHornVolume() {
		return hornVolume;
	}

    @Override
	public Float getRunVolume() {
		return runVolume;
	}

    @Override
	public Float getIdleVolume() {
		return idleVolume;
	}

	@Override
	public int getRunSoundLength() {
		return runSoundLenght;
	}

	@Override
	public int getIdleSoundLength() {
		return idleSoundLenght;
	}
    @Override
	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
