/**
 * This class is generated by jOOQ
 */
package com.mymock.db.firstdb.tables;


import com.mymock.db.firstdb.Firstdb;
import com.mymock.db.firstdb.tables.records.CtestRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Ctest extends TableImpl<CtestRecord> {

	private static final long serialVersionUID = -1142549885;

	/**
	 * The reference instance of <code>firstdb.ctest</code>
	 */
	public static final Ctest CTEST = new Ctest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CtestRecord> getRecordType() {
		return CtestRecord.class;
	}

	/**
	 * The column <code>firstdb.ctest.i</code>.
	 */
	public final TableField<CtestRecord, Integer> I = createField("i", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>firstdb.ctest.s</code>.
	 */
	public final TableField<CtestRecord, String> S = createField("s", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>firstdb.ctest.d</code>.
	 */
	public final TableField<CtestRecord, Timestamp> D = createField("d", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>firstdb.ctest</code> table reference
	 */
	public Ctest() {
		this("ctest", null);
	}

	/**
	 * Create an aliased <code>firstdb.ctest</code> table reference
	 */
	public Ctest(String alias) {
		this(alias, CTEST);
	}

	private Ctest(String alias, Table<CtestRecord> aliased) {
		this(alias, aliased, null);
	}

	private Ctest(String alias, Table<CtestRecord> aliased, Field<?>[] parameters) {
		super(alias, Firstdb.FIRSTDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Ctest as(String alias) {
		return new Ctest(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Ctest rename(String name) {
		return new Ctest(name, null);
	}
}