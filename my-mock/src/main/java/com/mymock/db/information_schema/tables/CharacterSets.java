/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables;


import com.mymock.db.information_schema.InformationSchema;
import com.mymock.db.information_schema.tables.records.CharacterSetsRecord;

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
public class CharacterSets extends TableImpl<CharacterSetsRecord> {

	private static final long serialVersionUID = 1194251072;

	/**
	 * The reference instance of <code>information_schema.CHARACTER_SETS</code>
	 */
	public static final CharacterSets CHARACTER_SETS = new CharacterSets();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CharacterSetsRecord> getRecordType() {
		return CharacterSetsRecord.class;
	}

	/**
	 * The column <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
	 */
	public final TableField<CharacterSetsRecord, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
	 */
	public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_NAME = createField("DEFAULT_COLLATE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
	 */
	public final TableField<CharacterSetsRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
	 */
	public final TableField<CharacterSetsRecord, Long> MAXLEN = createField("MAXLEN", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.CHARACTER_SETS</code> table reference
	 */
	public CharacterSets() {
		this("CHARACTER_SETS", null);
	}

	/**
	 * Create an aliased <code>information_schema.CHARACTER_SETS</code> table reference
	 */
	public CharacterSets(String alias) {
		this(alias, CHARACTER_SETS);
	}

	private CharacterSets(String alias, Table<CharacterSetsRecord> aliased) {
		this(alias, aliased, null);
	}

	private CharacterSets(String alias, Table<CharacterSetsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CharacterSets as(String alias) {
		return new CharacterSets(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CharacterSets rename(String name) {
		return new CharacterSets(name, null);
	}
}
