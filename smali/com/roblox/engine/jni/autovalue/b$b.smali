.class final Lcom/roblox/engine/jni/autovalue/b$b;
.super Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/view/Surface;

.field private b:Lcom/roblox/engine/jni/model/PlatformParams;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/Long;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/Integer;

.field private i:Ljava/lang/String;

.field private j:Landroid/app/Activity;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/engine/jni/autovalue/StartAppParams;
    .locals 14

    .line 1
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->a:Landroid/view/Surface;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/b$b;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/b$b;->c:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/b$b;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/b$b;->e:Ljava/lang/Long;

    if-eqz v0, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/b$b;->f:Ljava/lang/Boolean;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/b$b;->g:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/b$b;->h:Ljava/lang/Integer;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/b$b;->i:Ljava/lang/String;

    if-nez v5, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v13, Lcom/roblox/engine/jni/autovalue/b;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/b$b;->f:Ljava/lang/Boolean;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    iget-object v8, p0, Lcom/roblox/engine/jni/autovalue/b$b;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/b$b;->h:Ljava/lang/Integer;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v10, p0, Lcom/roblox/engine/jni/autovalue/b$b;->i:Ljava/lang/String;

    iget-object v11, p0, Lcom/roblox/engine/jni/autovalue/b$b;->j:Landroid/app/Activity;

    const/4 v12, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lcom/roblox/engine/jni/autovalue/b;-><init>(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/String;Landroid/app/Activity;Lcom/roblox/engine/jni/autovalue/b$a;)V

    return-object v13

    .line 6
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->a:Landroid/view/Surface;

    if-nez v1, :cond_2

    const-string v1, " surface"

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    if-nez v1, :cond_3

    const-string v1, " platformParams"

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->c:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string v1, " appStarterPlace"

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    :cond_4
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->d:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " appStarterScript"

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    :cond_5
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->e:Ljava/lang/Long;

    if-nez v1, :cond_6

    const-string v1, " appUserId"

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    :cond_6
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->f:Ljava/lang/Boolean;

    if-nez v1, :cond_7

    const-string v1, " isUnder13"

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    :cond_7
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->g:Ljava/lang/String;

    if-nez v1, :cond_8

    const-string v1, " username"

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    :cond_8
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->h:Ljava/lang/Integer;

    if-nez v1, :cond_9

    const-string v1, " membershipType"

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    :cond_9
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->i:Ljava/lang/String;

    if-nez v1, :cond_a

    const-string v1, " selectedTheme"

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    :cond_a
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

.method public b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    const-string v0, "Null appStarterPlace"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    const-string v0, "Null appStarterScript"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(J)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public e(Z)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->f:Ljava/lang/Boolean;

    return-object p0
.end method

.method public f(I)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->h:Ljava/lang/Integer;

    return-object p0
.end method

.method public g(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    const-string v0, "Null platformParams"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    const-string v0, "Null selectedTheme"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->i:Ljava/lang/String;

    return-object p0
.end method

.method public i(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    const-string v0, "Null surface"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->a:Landroid/view/Surface;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    const-string v0, "Null username"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public k(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/b$b;->j:Landroid/app/Activity;

    return-object p0
.end method
