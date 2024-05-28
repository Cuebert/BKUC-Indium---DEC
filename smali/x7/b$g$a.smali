.class Lx7/b$g$a;
.super Lf9/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx7/b$g;->a()Lf9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Lx7/b$g;


# direct methods
.method constructor <init>(Lx7/b$g;)V
    .locals 0

    iput-object p1, p0, Lx7/b$g$a;->g:Lx7/b$g;

    invoke-direct {p0}, Lf9/g;-><init>()V

    return-void
.end method


# virtual methods
.method protected e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/roblox/client/k;->c(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Lcom/roblox/client/p0;->v()Ljava/lang/String;

    move-result-object p2

    const-string v0, "assets"

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/content/guac/defaultConfigs/GuacDefaultPolicy-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".json"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetDefaultAppPolicyFile(Ljava/lang/String;)V

    return-void
.end method
