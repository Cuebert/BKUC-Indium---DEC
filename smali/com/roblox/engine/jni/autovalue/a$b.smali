.class final Lcom/roblox/engine/jni/autovalue/a$b;
.super Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/roblox/engine/jni/model/PlatformParams;

.field private b:Lcom/roblox/engine/jni/model/DeviceParams;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/Boolean;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/lang/String;

.field private h:Landroid/app/Activity;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/engine/jni/autovalue/InitParams;
    .locals 11

    .line 1
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/a$b;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/a$b;->c:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/a$b;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a$b;->e:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/a$b;->f:Ljava/lang/Boolean;

    if-nez v5, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v10, Lcom/roblox/engine/jni/autovalue/a;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a$b;->f:Ljava/lang/Boolean;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v7, p0, Lcom/roblox/engine/jni/autovalue/a$b;->g:Ljava/lang/String;

    iget-object v8, p0, Lcom/roblox/engine/jni/autovalue/a$b;->h:Landroid/app/Activity;

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/roblox/engine/jni/autovalue/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/a$a;)V

    return-object v10

    .line 5
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    if-nez v1, :cond_2

    const-string v1, " platformParams"

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    if-nez v1, :cond_3

    const-string v1, " deviceParams"

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->c:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string v1, " baseURL"

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    :cond_4
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->d:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " userAgent"

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    :cond_5
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->e:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    const-string v1, " isTablet"

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    :cond_6
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->f:Ljava/lang/Boolean;

    if-nez v1, :cond_7

    const-string v1, " isVrDevice"

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 1

    const-string v0, "Null baseURL"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 1

    const-string v0, "Null deviceParams"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object p0
.end method

.method public e(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public f(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->f:Ljava/lang/Boolean;

    return-object p0
.end method

.method public g(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 1

    const-string v0, "Null platformParams"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 1

    const-string v0, "Null userAgent"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a$b;->d:Ljava/lang/String;

    return-object p0
.end method
