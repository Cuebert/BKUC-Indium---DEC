.class public final Li2/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Li2/m0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Li2/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Li2/t0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Ljava/lang/String;",
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
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Li2/e;",
            ">;",
            "Lsa/a<",
            "Li2/t0;",
            ">;",
            "Lsa/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li2/n0;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Li2/n0;->b:Lsa/a;

    .line 4
    iput-object p3, p0, Li2/n0;->c:Lsa/a;

    .line 5
    iput-object p4, p0, Li2/n0;->d:Lsa/a;

    .line 6
    iput-object p5, p0, Li2/n0;->e:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)Li2/n0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Li2/e;",
            ">;",
            "Lsa/a<",
            "Li2/t0;",
            ">;",
            "Lsa/a<",
            "Ljava/lang/String;",
            ">;)",
            "Li2/n0;"
        }
    .end annotation

    new-instance v6, Li2/n0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Li2/n0;-><init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V

    return-object v6
.end method

.method public static c(Lk2/a;Lk2/a;Ljava/lang/Object;Ljava/lang/Object;Lsa/a;)Li2/m0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/a;",
            "Lk2/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lsa/a<",
            "Ljava/lang/String;",
            ">;)",
            "Li2/m0;"
        }
    .end annotation

    new-instance v6, Li2/m0;

    move-object v3, p2

    check-cast v3, Li2/e;

    move-object v4, p3

    check-cast v4, Li2/t0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Li2/m0;-><init>(Lk2/a;Lk2/a;Li2/e;Li2/t0;Lsa/a;)V

    return-object v6
.end method


# virtual methods
.method public b()Li2/m0;
    .locals 5

    iget-object v0, p0, Li2/n0;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk2/a;

    iget-object v1, p0, Li2/n0;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk2/a;

    iget-object v2, p0, Li2/n0;->c:Lsa/a;

    invoke-interface {v2}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Li2/n0;->d:Lsa/a;

    invoke-interface {v3}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Li2/n0;->e:Lsa/a;

    invoke-static {v0, v1, v2, v3, v4}, Li2/n0;->c(Lk2/a;Lk2/a;Ljava/lang/Object;Ljava/lang/Object;Lsa/a;)Li2/m0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li2/n0;->b()Li2/m0;

    move-result-object v0

    return-object v0
.end method
