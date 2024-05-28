.class public Lh8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/p$b;,
        Lh8/p$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lh8/i;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lh8/p;->b:Ljava/util/HashMap;

    .line 5
    invoke-virtual {p0}, Lh8/p;->g()V

    return-void
.end method

.method synthetic constructor <init>(Lh8/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh8/p;-><init>()V

    return-void
.end method

.method public static c()Lh8/p;
    .locals 1

    sget-object v0, Lh8/p$c;->a:Lh8/p;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/p;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 2
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 3
    invoke-virtual {p0}, Lh8/p;->g()V

    return-void
.end method

.method public b(Ljava/lang/String;)Lh8/i;
    .locals 1

    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh8/i;

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lh8/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    new-instance v1, Lh8/p$b;

    invoke-direct {v1, p0, p1}, Lh8/p$b;-><init>(Lh8/p;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_0
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh8/i;

    return-object p1
.end method

.method public e(Ljava/lang/String;J)Lh8/i;
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    new-instance v1, Lh8/b;

    invoke-direct {v1, p2, p3}, Lh8/b;-><init>(J)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    :cond_0
    iget-object p2, p0, Lh8/p;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh8/i;

    return-object p1
.end method

.method public f(J)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh8/p;->b:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    new-instance v1, Lh8/f;

    invoke-direct {v1}, Lh8/f;-><init>()V

    const-string v2, "FriendRequestReceived"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    new-instance v1, Lh8/e;

    invoke-direct {v1}, Lh8/e;-><init>()V

    const-string v2, "FriendRequestAccepted"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    new-instance v1, Lh8/k;

    invoke-direct {v1}, Lh8/k;-><init>()V

    const-string v2, "PrivateMessageReceived"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(JLjava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh8/p;->b:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lh8/p;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
