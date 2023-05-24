package com.onlye.permission

import android.Manifest
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.permissionx.guolindev.PermissionX

/**
 * @author: onlye
 * @description:权限请求工具类,统一处理各种权限的动态请求,向下兼容各个版本
 * @date:2023/5/25 1:41
 * @version:
 * @email: 986289773@qq.com
 */
class PermissionExt {

}


/**
 * 请求定位权限
 */
fun FragmentActivity.requestLocation() {
    PermissionX
        .init(this)
        .permissions(Manifest.permission.ACCESS_FINE_LOCATION)
//        .setDialogTintColor(Color.parseColor("#1972e8"), Color.parseColor("#8ab6f5"))
        .onExplainRequestReason{scope,deniedList,beforeRequest->
            val message = "needs following permissions to continue"
            scope.showRequestReasonDialog(deniedList, message, "Allow", "Deny")
        }
        .onForwardToSettings{scope,deniedList->
            val message = "Please allow following permissions in settings"
            scope.showForwardToSettingsDialog(deniedList, message, "Allow", "Deny")
        }
        .request{allGranted, grantedList, deniedList ->
            if (allGranted) {
                Toast.makeText(this, "All permissions are granted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "The following permissions are denied：$deniedList", Toast.LENGTH_SHORT).show()
            }
        }
}