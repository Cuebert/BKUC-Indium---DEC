.class public Lcom/Indium/IndiumMain;
.super Ljava/lang/Object;
.source "IndiumMain.java"


# static fields
.field public static debug_mode:Z

.field public static rbx_ctxt:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Start(Landroid/content/Context;)V
    .locals 5

    const/4 v0, 0x1

    .line 20
    sput-boolean v0, Lcom/Indium/IndiumMain;->debug_mode:Z

    .line 21
    check-cast p0, Landroid/app/Activity;

    sput-object p0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    .line 25
    invoke-static {p0}, Lcom/Indium/CrashHandler;->init(Landroid/content/Context;)V

    .line 26
    invoke-static {}, Lcom/Indium/Logcat;->save_logs()V

    .line 30
    sget-object p0, Lcom/Indium/IndiumMain;->rbx_ctxt:Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v2, "android.permission.READ_MEDIA_IMAGES"

    const-string v3, "android.permission.MANAGE_EXTERNAL_STORAGE"

    const-string v4, "android.permission.ACCESS_MEDIA_LOCATION"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v0}, Lcom/Indium/JniUtils$$ExternalSyntheticApiModelOutline0;->m(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 45
    const-string p0, "Indium"

    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 46
    sget-object p0, Lcom/Indium/Logcat;->log_tag:Ljava/lang/String;

    const-string v0, "Loaded lib!"

    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    sget-object p0, Lcom/Indium/Logcat;->log_tag:Ljava/lang/String;

    const-string v0, "Java Side initiated!"

    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
