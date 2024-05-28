.class public final Lg2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lg2/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lb2/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lh2/x;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Li2/d;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lj2/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lsa/a<",
            "Lb2/e;",
            ">;",
            "Lsa/a<",
            "Lh2/x;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lj2/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg2/d;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Lg2/d;->b:Lsa/a;

    .line 4
    iput-object p3, p0, Lg2/d;->c:Lsa/a;

    .line 5
    iput-object p4, p0, Lg2/d;->d:Lsa/a;

    .line 6
    iput-object p5, p0, Lg2/d;->e:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)Lg2/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lsa/a<",
            "Lb2/e;",
            ">;",
            "Lsa/a<",
            "Lh2/x;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lj2/b;",
            ">;)",
            "Lg2/d;"
        }
    .end annotation

    new-instance v6, Lg2/d;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg2/d;-><init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;Lb2/e;Lh2/x;Li2/d;Lj2/b;)Lg2/c;
    .locals 7

    new-instance v6, Lg2/c;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg2/c;-><init>(Ljava/util/concurrent/Executor;Lb2/e;Lh2/x;Li2/d;Lj2/b;)V

    return-object v6
.end method


# virtual methods
.method public b()Lg2/c;
    .locals 5

    iget-object v0, p0, Lg2/d;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lg2/d;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/e;

    iget-object v2, p0, Lg2/d;->c:Lsa/a;

    invoke-interface {v2}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/x;

    iget-object v3, p0, Lg2/d;->d:Lsa/a;

    invoke-interface {v3}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/d;

    iget-object v4, p0, Lg2/d;->e:Lsa/a;

    invoke-interface {v4}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj2/b;

    invoke-static {v0, v1, v2, v3, v4}, Lg2/d;->c(Ljava/util/concurrent/Executor;Lb2/e;Lh2/x;Li2/d;Lj2/b;)Lg2/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg2/d;->b()Lg2/c;

    move-result-object v0

    return-object v0
.end method
