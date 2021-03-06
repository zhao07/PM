package gov.nist.csd.pm.common.browser;

import gov.nist.csd.pm.common.graphics.GraphicsUtil;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 9/7/11
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public final class PmNodeIcons {
    private PmNodeIcons(){}
    private static final ImageIcon rootIcon;
    private static final ImageIcon userAttributeIcon;
    private static final ImageIcon userIcon;
    private static final ImageIcon policyClassIcon;
    private static final ImageIcon backLinkIcon;
    private static final ImageIcon resourceIcon;
    private static final ImageIcon objectIcon;
    private static final ImageIcon objectAttributeIcon;
    private static final ImageIcon opsetIcon;
    private static final Map<PmNodeType, Icon> iconsForTypes = new HashMap<PmNodeType, Icon>();
    static{
        rootIcon = GraphicsUtil.getImageIcon("/images/root.gif", PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.CONNECTOR, rootIcon);
        userAttributeIcon = GraphicsUtil.getImageIcon("/images/userAttribute3.gif",
                PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.USER_ATTRIBUTE, userAttributeIcon);

        userIcon = GraphicsUtil.getImageIcon("/images/user3.gif", PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.USER, userIcon);

        policyClassIcon = GraphicsUtil.getImageIcon("/images/policyClass.gif",
                PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.POLICY, policyClassIcon);

        backLinkIcon = GraphicsUtil.getImageIcon("/images/backLink.gif",
                PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.BACKLINK, backLinkIcon);

        resourceIcon = GraphicsUtil.getImageIcon("/images/resource.gif",
                PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.RESOURCE, resourceIcon);

        objectIcon = GraphicsUtil.getImageIcon("/images/object3.gif",
                PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.OBJECT, objectIcon);

        objectAttributeIcon = GraphicsUtil.getImageIcon("/images/objectAttribute3.gif",
                PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.OBJECT_ATTRIBUTE, objectAttributeIcon);

        opsetIcon = GraphicsUtil.getImageIcon("/images/opset.gif",
                PmNodeIcons.class);
        iconsForTypes.put(PmNodeType.OPSET, opsetIcon);


    }

    public static Icon getIconForNodeType(PmNodeType type){
        return iconsForTypes.get(type);
    }
}
