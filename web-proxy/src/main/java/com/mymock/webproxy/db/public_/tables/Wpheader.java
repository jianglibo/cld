/**
 * This class is generated by jOOQ
 */
package com.mymock.webproxy.db.public_.tables;


import com.mymock.webproxy.db.public_.Keys;
import com.mymock.webproxy.db.public_.Public;
import com.mymock.webproxy.db.public_.tables.records.WpheaderRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Wpheader extends TableImpl<WpheaderRecord> {

	private static final long serialVersionUID = -219392833;

	/**
	 * The reference instance of <code>PUBLIC.WPHEADER</code>
	 */
	public static final Wpheader WPHEADER = new Wpheader();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<WpheaderRecord> getRecordType() {
		return WpheaderRecord.class;
	}

	/**
	 * The column <code>PUBLIC.WPHEADER.ID</code>.
	 */
	public final TableField<WpheaderRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>PUBLIC.WPHEADER.URL_ID</code>.
	 */
	public final TableField<WpheaderRecord, Integer> URL_ID = createField("URL_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.WPHEADER.HEADER_NAME</code>.
	 */
	public final TableField<WpheaderRecord, String> HEADER_NAME = createField("HEADER_NAME", org.jooq.impl.SQLDataType.CHAR.length(30), this, "");

	/**
	 * The column <code>PUBLIC.WPHEADER.HEADER_VALUE</code>.
	 */
	public final TableField<WpheaderRecord, String> HEADER_VALUE = createField("HEADER_VALUE", org.jooq.impl.SQLDataType.CHAR.length(255), this, "");

	/**
	 * Create a <code>PUBLIC.WPHEADER</code> table reference
	 */
	public Wpheader() {
		this("WPHEADER", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.WPHEADER</code> table reference
	 */
	public Wpheader(String alias) {
		this(alias, WPHEADER);
	}

	private Wpheader(String alias, Table<WpheaderRecord> aliased) {
		this(alias, aliased, null);
	}

	private Wpheader(String alias, Table<WpheaderRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<WpheaderRecord, Integer> getIdentity() {
		return Keys.IDENTITY_WPHEADER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<WpheaderRecord> getPrimaryKey() {
		return Keys.CONSTRAINT_5;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<WpheaderRecord>> getKeys() {
		return Arrays.<UniqueKey<WpheaderRecord>>asList(Keys.CONSTRAINT_5);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<WpheaderRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<WpheaderRecord, ?>>asList(Keys.FK_HEADER_URL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Wpheader as(String alias) {
		return new Wpheader(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Wpheader rename(String name) {
		return new Wpheader(name, null);
	}
}
