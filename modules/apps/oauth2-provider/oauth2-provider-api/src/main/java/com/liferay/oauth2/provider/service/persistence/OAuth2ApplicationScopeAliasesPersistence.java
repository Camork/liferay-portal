/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.oauth2.provider.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.oauth2.provider.exception.NoSuchOAuth2ApplicationScopeAliasesException;
import com.liferay.oauth2.provider.model.OAuth2ApplicationScopeAliases;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the o auth2 application scope aliases service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuth2ApplicationScopeAliasesUtil
 * @generated
 */
@ProviderType
public interface OAuth2ApplicationScopeAliasesPersistence
	extends BasePersistence<OAuth2ApplicationScopeAliases> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OAuth2ApplicationScopeAliasesUtil} to access the o auth2 application scope aliases persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the o auth2 application scope aliaseses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByC(
		long companyId);

	/**
	 * Returns a range of all the o auth2 application scope aliaseses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @return the range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByC(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByC(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first o auth2 application scope aliases in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases findByC_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Returns the first o auth2 application scope aliases in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth2 application scope aliases, or <code>null</code> if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases fetchByC_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns the last o auth2 application scope aliases in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases findByC_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Returns the last o auth2 application scope aliases in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth2 application scope aliases, or <code>null</code> if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases fetchByC_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns the o auth2 application scope aliaseses before and after the current o auth2 application scope aliases in the ordered set where companyId = &#63;.
	 *
	 * @param oAuth2ApplicationScopeAliasesId the primary key of the current o auth2 application scope aliases
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a o auth2 application scope aliases with the primary key could not be found
	 */
	public OAuth2ApplicationScopeAliases[] findByC_PrevAndNext(
			long oAuth2ApplicationScopeAliasesId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Removes all the o auth2 application scope aliaseses where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByC(long companyId);

	/**
	 * Returns the number of o auth2 application scope aliaseses where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching o auth2 application scope aliaseses
	 */
	public int countByC(long companyId);

	/**
	 * Returns all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @return the matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases>
		findByOAuth2ApplicationId(long oAuth2ApplicationId);

	/**
	 * Returns a range of all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @return the range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases>
		findByOAuth2ApplicationId(long oAuth2ApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases>
		findByOAuth2ApplicationId(
			long oAuth2ApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases>
		findByOAuth2ApplicationId(
			long oAuth2ApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator,
			boolean retrieveFromCache);

	/**
	 * Returns the first o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases findByOAuth2ApplicationId_First(
			long oAuth2ApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Returns the first o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth2 application scope aliases, or <code>null</code> if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases fetchByOAuth2ApplicationId_First(
		long oAuth2ApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns the last o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases findByOAuth2ApplicationId_Last(
			long oAuth2ApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Returns the last o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth2 application scope aliases, or <code>null</code> if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases fetchByOAuth2ApplicationId_Last(
		long oAuth2ApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns the o auth2 application scope aliaseses before and after the current o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63;.
	 *
	 * @param oAuth2ApplicationScopeAliasesId the primary key of the current o auth2 application scope aliases
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a o auth2 application scope aliases with the primary key could not be found
	 */
	public OAuth2ApplicationScopeAliases[]
			findByOAuth2ApplicationId_PrevAndNext(
				long oAuth2ApplicationScopeAliasesId, long oAuth2ApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Removes all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63; from the database.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 */
	public void removeByOAuth2ApplicationId(long oAuth2ApplicationId);

	/**
	 * Returns the number of o auth2 application scope aliaseses where oAuth2ApplicationId = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @return the number of matching o auth2 application scope aliaseses
	 */
	public int countByOAuth2ApplicationId(long oAuth2ApplicationId);

	/**
	 * Returns all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @return the matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByO_S(
		long oAuth2ApplicationId, long scopeAliasesHash);

	/**
	 * Returns a range of all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @return the range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByO_S(
		long oAuth2ApplicationId, long scopeAliasesHash, int start, int end);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByO_S(
		long oAuth2ApplicationId, long scopeAliasesHash, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findByO_S(
		long oAuth2ApplicationId, long scopeAliasesHash, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases findByO_S_First(
			long oAuth2ApplicationId, long scopeAliasesHash,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Returns the first o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth2 application scope aliases, or <code>null</code> if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases fetchByO_S_First(
		long oAuth2ApplicationId, long scopeAliasesHash,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns the last o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases findByO_S_Last(
			long oAuth2ApplicationId, long scopeAliasesHash,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Returns the last o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth2 application scope aliases, or <code>null</code> if a matching o auth2 application scope aliases could not be found
	 */
	public OAuth2ApplicationScopeAliases fetchByO_S_Last(
		long oAuth2ApplicationId, long scopeAliasesHash,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns the o auth2 application scope aliaseses before and after the current o auth2 application scope aliases in the ordered set where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * @param oAuth2ApplicationScopeAliasesId the primary key of the current o auth2 application scope aliases
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a o auth2 application scope aliases with the primary key could not be found
	 */
	public OAuth2ApplicationScopeAliases[] findByO_S_PrevAndNext(
			long oAuth2ApplicationScopeAliasesId, long oAuth2ApplicationId,
			long scopeAliasesHash,
			com.liferay.portal.kernel.util.OrderByComparator
				<OAuth2ApplicationScopeAliases> orderByComparator)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Removes all the o auth2 application scope aliaseses where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63; from the database.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 */
	public void removeByO_S(long oAuth2ApplicationId, long scopeAliasesHash);

	/**
	 * Returns the number of o auth2 application scope aliaseses where oAuth2ApplicationId = &#63; and scopeAliasesHash = &#63;.
	 *
	 * @param oAuth2ApplicationId the o auth2 application ID
	 * @param scopeAliasesHash the scope aliases hash
	 * @return the number of matching o auth2 application scope aliaseses
	 */
	public int countByO_S(long oAuth2ApplicationId, long scopeAliasesHash);

	/**
	 * Caches the o auth2 application scope aliases in the entity cache if it is enabled.
	 *
	 * @param oAuth2ApplicationScopeAliases the o auth2 application scope aliases
	 */
	public void cacheResult(
		OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases);

	/**
	 * Caches the o auth2 application scope aliaseses in the entity cache if it is enabled.
	 *
	 * @param oAuth2ApplicationScopeAliaseses the o auth2 application scope aliaseses
	 */
	public void cacheResult(
		java.util.List<OAuth2ApplicationScopeAliases>
			oAuth2ApplicationScopeAliaseses);

	/**
	 * Creates a new o auth2 application scope aliases with the primary key. Does not add the o auth2 application scope aliases to the database.
	 *
	 * @param oAuth2ApplicationScopeAliasesId the primary key for the new o auth2 application scope aliases
	 * @return the new o auth2 application scope aliases
	 */
	public OAuth2ApplicationScopeAliases create(
		long oAuth2ApplicationScopeAliasesId);

	/**
	 * Removes the o auth2 application scope aliases with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oAuth2ApplicationScopeAliasesId the primary key of the o auth2 application scope aliases
	 * @return the o auth2 application scope aliases that was removed
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a o auth2 application scope aliases with the primary key could not be found
	 */
	public OAuth2ApplicationScopeAliases remove(
			long oAuth2ApplicationScopeAliasesId)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	public OAuth2ApplicationScopeAliases updateImpl(
		OAuth2ApplicationScopeAliases oAuth2ApplicationScopeAliases);

	/**
	 * Returns the o auth2 application scope aliases with the primary key or throws a <code>NoSuchOAuth2ApplicationScopeAliasesException</code> if it could not be found.
	 *
	 * @param oAuth2ApplicationScopeAliasesId the primary key of the o auth2 application scope aliases
	 * @return the o auth2 application scope aliases
	 * @throws NoSuchOAuth2ApplicationScopeAliasesException if a o auth2 application scope aliases with the primary key could not be found
	 */
	public OAuth2ApplicationScopeAliases findByPrimaryKey(
			long oAuth2ApplicationScopeAliasesId)
		throws NoSuchOAuth2ApplicationScopeAliasesException;

	/**
	 * Returns the o auth2 application scope aliases with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oAuth2ApplicationScopeAliasesId the primary key of the o auth2 application scope aliases
	 * @return the o auth2 application scope aliases, or <code>null</code> if a o auth2 application scope aliases with the primary key could not be found
	 */
	public OAuth2ApplicationScopeAliases fetchByPrimaryKey(
		long oAuth2ApplicationScopeAliasesId);

	/**
	 * Returns all the o auth2 application scope aliaseses.
	 *
	 * @return the o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findAll();

	/**
	 * Returns a range of all the o auth2 application scope aliaseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @return the range of o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator);

	/**
	 * Returns an ordered range of all the o auth2 application scope aliaseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuth2ApplicationScopeAliasesModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o auth2 application scope aliaseses
	 * @param end the upper bound of the range of o auth2 application scope aliaseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of o auth2 application scope aliaseses
	 */
	public java.util.List<OAuth2ApplicationScopeAliases> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OAuth2ApplicationScopeAliases> orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the o auth2 application scope aliaseses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of o auth2 application scope aliaseses.
	 *
	 * @return the number of o auth2 application scope aliaseses
	 */
	public int countAll();

}