package com.indus.training.core;

/**
 * Represents a state with a name, geographic location, capital, and chief
 * minister.
 */
public class State {

	private final String name;
	private final String geographicLocation;
	private Capital capital;
	private String chiefminister;

	/**
	 * Creates an instance of State with given name and geographic location
	 * 
	 * @param name               the name of the state
	 * @param geographicLocation the geographic location of the state
	 */
	public State(String name, String geographicLocation) {
		this.name = name;
		this.geographicLocation = geographicLocation;
	}

	/**
	 * Returns the name of the state.
	 *
	 * @return the name of the state
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the chief minister of the state.
	 *
	 * @return the chief minister of the state
	 */
	public String getChiefminister() {
		return chiefminister;
	}

	/**
	 * Sets the chief minister of the state.
	 *
	 * @param chiefMinister the chief minister of the state
	 */
	public void setChiefminister(String chiefminister) {
		this.chiefminister = chiefminister;
	}

	/**
	 * Returns the geographic location of the state.
	 *
	 * @return the geographic location of the state
	 */
	public String getGeographicLocation() {
		return geographicLocation;
	}

	/**
	 * Returns the capital of the state.
	 *
	 * @return the capital of the state
	 */
	public Capital getCapital() {
		return capital;
	}

	/**
	 * Sets the capital of the state.
	 *
	 * @param capital the capital of the state
	 */
	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	/**
	 * Represents the capital of a state.
	 */
	public class Capital {
		private String name;

		/**
		 * Creates instance of Capital
		 * 
		 * @param name the name of the Capital
		 */
		public Capital(String name) {

			this.name = name;
		}

		/**
		 * Gets the name of the Capital
		 * 
		 * @return the Capital name
		 */
		public String getName() {
			return this.name;
		}
	}

}
