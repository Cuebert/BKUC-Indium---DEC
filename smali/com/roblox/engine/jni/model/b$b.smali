.class final Lcom/roblox/engine/jni/model/b$b;
.super Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/model/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Boolean;

.field private i:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;
    .locals 12

    .line 1
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->a:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/roblox/engine/jni/model/b$b;->b:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/model/b$b;->c:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/model/b$b;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/model/b$b;->e:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/model/b$b;->f:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v7, p0, Lcom/roblox/engine/jni/model/b$b;->g:Ljava/util/List;

    if-eqz v7, :cond_1

    iget-object v0, p0, Lcom/roblox/engine/jni/model/b$b;->h:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v8, p0, Lcom/roblox/engine/jni/model/b$b;->i:Ljava/lang/String;

    if-nez v8, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v11, Lcom/roblox/engine/jni/model/b;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iget-object v9, p0, Lcom/roblox/engine/jni/model/b$b;->i:Ljava/lang/String;

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lcom/roblox/engine/jni/model/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/roblox/engine/jni/model/b$a;)V

    return-object v11

    .line 4
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " appVersion"

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->b:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, " baseUrl"

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->c:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string v1, " countName"

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    :cond_4
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->d:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " uploadUrl"

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    :cond_5
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->e:Ljava/lang/String;

    if-nez v1, :cond_6

    const-string v1, " token"

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    :cond_6
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->f:Ljava/lang/String;

    if-nez v1, :cond_7

    const-string v1, " handlerClassName"

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    :cond_7
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->g:Ljava/util/List;

    if-nez v1, :cond_8

    const-string v1, " envArgs"

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    :cond_8
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->h:Ljava/lang/Boolean;

    if-nez v1, :cond_9

    const-string v1, " isAtLeastQ"

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    :cond_9
    iget-object v1, p0, Lcom/roblox/engine/jni/model/b$b;->i:Ljava/lang/String;

    if-nez v1, :cond_a

    const-string v1, " buildVariant"

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
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

.method public c(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    const-string v0, "Null appVersion"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    const-string v0, "Null baseUrl"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    const-string v0, "Null buildVariant"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->i:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    const-string v0, "Null countName"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/util/List;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;"
        }
    .end annotation

    const-string v0, "Null envArgs"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->g:Ljava/util/List;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    const-string v0, "Null handlerClassName"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public i(Z)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->h:Ljava/lang/Boolean;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    const-string v0, "Null token"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    const-string v0, "Null uploadUrl"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/b$b;->d:Ljava/lang/String;

    return-object p0
.end method
