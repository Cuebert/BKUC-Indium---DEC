.class Lcom/roblox/client/p0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/p0;->f0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/pm/ApplicationInfo;


# direct methods
.method constructor <init>(Landroid/content/pm/ApplicationInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/p0$a;->a:Landroid/content/pm/ApplicationInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/roblox/client/j;)V
    .locals 5

    const-string v0, "roblox.config"

    if-eqz p2, :cond_0

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "crashpad init error "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 p2, 0x5

    new-array p2, p2, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ANDROID_DATA="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "ANDROID_DATA"

    .line 3
    invoke-static {v3}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, p2, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANDROID_ROOT="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ANDROID_ROOT"

    .line 4
    invoke-static {v2}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, p2, v2

    const/4 v1, 0x2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ANDROID_STORAGE="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "ANDROID_STORAGE"

    .line 5
    invoke-static {v4}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, p2, v1

    const/4 v1, 0x3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "LIBRARYPATH="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    const/4 p1, 0x4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CLASSPATH=.:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/roblox/client/p0$a;->a:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p2, p1

    .line 6
    invoke-static {}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;->builder()Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 7
    invoke-static {}, Lcom/roblox/client/p0;->f1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->c(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 8
    invoke-static {}, Lcom/roblox/client/p0;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->d(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 9
    invoke-static {}, Lcom/roblox/client/p0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->f(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 10
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->V()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->k(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 11
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->o1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->j(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    const-class v1, Lcom/roblox/client/analytics/CrashpadHandler;

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->h(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 13
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->g(Ljava/util/List;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 14
    invoke-static {}, Lcom/roblox/client/p0;->h0()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->i(Z)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "googleProd"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "release"

    .line 15
    invoke-static {v1}, Lc9/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->e(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;->b()Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;

    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeInitCrashpad(Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 18
    invoke-static {v2}, Lcom/roblox/client/p0;->c(Z)Z

    const-string p1, "Crashpad monitoring is ON"

    .line 19
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method
