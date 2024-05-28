.class final Lcom/roblox/engine/jni/autovalue/a;
.super Lcom/roblox/engine/jni/autovalue/InitParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/a$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/roblox/engine/jni/model/PlatformParams;

.field private final b:Lcom/roblox/engine/jni/model/DeviceParams;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Z

.field private final f:Z

.field private final g:Ljava/lang/String;

.field private final h:Landroid/app/Activity;


# direct methods
.method private constructor <init>(Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/InitParams;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    .line 5
    iput-object p3, p0, Lcom/roblox/engine/jni/autovalue/a;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/roblox/engine/jni/autovalue/a;->d:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lcom/roblox/engine/jni/autovalue/a;->e:Z

    .line 8
    iput-boolean p6, p0, Lcom/roblox/engine/jni/autovalue/a;->f:Z

    .line 9
    iput-object p7, p0, Lcom/roblox/engine/jni/autovalue/a;->g:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/roblox/engine/jni/autovalue/a;->h:Landroid/app/Activity;

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/a$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/roblox/engine/jni/autovalue/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;Lcom/roblox/engine/jni/model/DeviceParams;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public baseURL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public buildVariant()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a;->g:Ljava/lang/String;

    return-object v0
.end method

.method public deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/InitParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 2
    check-cast p1, Lcom/roblox/engine/jni/autovalue/InitParams;

    .line 3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->platformParams()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    .line 4
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->c:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->baseURL()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->d:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->userAgent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/a;->e:Z

    .line 7
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->isTablet()Z

    move-result v3

    if-ne v1, v3, :cond_3

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/a;->f:Z

    .line 8
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->isVrDevice()Z

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->g:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->buildVariant()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->buildVariant()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->h:Landroid/app/Activity;

    if-nez v1, :cond_2

    .line 10
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/InitParams;->vrContext()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_4
    return v2
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 2
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 3
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/a;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 4
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/a;->d:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 5
    iget-boolean v2, p0, Lcom/roblox/engine/jni/autovalue/a;->e:Z

    const/16 v3, 0x4cf

    const/16 v4, 0x4d5

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 6
    iget-boolean v2, p0, Lcom/roblox/engine/jni/autovalue/a;->f:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 v3, 0x4d5

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 7
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/a;->g:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 8
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->h:Landroid/app/Activity;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    return v0
.end method

.method public isTablet()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/engine/jni/autovalue/a;->e:Z

    return v0
.end method

.method public isVrDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/engine/jni/autovalue/a;->f:Z

    return v0
.end method

.method public platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InitParams{platformParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->a:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->b:Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", baseURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", userAgent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isTablet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/a;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isVrDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/a;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", buildVariant="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", vrContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/a;->h:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public userAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public vrContext()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/a;->h:Landroid/app/Activity;

    return-object v0
.end method
