/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ää implements org.jooq.test.h2.generatedclasses.tables.interfaces.IÄä {

	private static final long serialVersionUID = 277220409;

	private java.lang.Integer öö;

	@Override
	public java.lang.Integer getÖö() {
		return this.öö;
	}

	@Override
	public void setÖö(java.lang.Integer öö) {
		this.öö = öö;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IÄä from) {
		setÖö(from.getÖö());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IÄä> E into(E into) {
		into.from(this);
		return into;
	}
}
