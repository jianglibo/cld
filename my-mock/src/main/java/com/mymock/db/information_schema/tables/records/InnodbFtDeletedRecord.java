/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables.records;


import com.mymock.db.information_schema.tables.InnodbFtDeleted;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFtDeletedRecord extends TableRecordImpl<InnodbFtDeletedRecord> implements Record1<ULong> {

	private static final long serialVersionUID = 802100115;

	/**
	 * Setter for <code>information_schema.INNODB_FT_DELETED.DOC_ID</code>.
	 */
	public void setDocId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_FT_DELETED.DOC_ID</code>.
	 */
	public ULong getDocId() {
		return (ULong) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<ULong> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<ULong> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return InnodbFtDeleted.INNODB_FT_DELETED.DOC_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getDocId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtDeletedRecord value1(ULong value) {
		setDocId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtDeletedRecord values(ULong value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbFtDeletedRecord
	 */
	public InnodbFtDeletedRecord() {
		super(InnodbFtDeleted.INNODB_FT_DELETED);
	}

	/**
	 * Create a detached, initialised InnodbFtDeletedRecord
	 */
	public InnodbFtDeletedRecord(ULong docId) {
		super(InnodbFtDeleted.INNODB_FT_DELETED);

		setValue(0, docId);
	}
}
