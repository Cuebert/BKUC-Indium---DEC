.class public final La2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "La2/t;",
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
            "Lg2/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lh2/r;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lh2/v;",
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
            "Lg2/e;",
            ">;",
            "Lsa/a<",
            "Lh2/r;",
            ">;",
            "Lsa/a<",
            "Lh2/v;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La2/v;->a:Lsa/a;

    .line 3
    iput-object p2, p0, La2/v;->b:Lsa/a;

    .line 4
    iput-object p3, p0, La2/v;->c:Lsa/a;

    .line 5
    iput-object p4, p0, La2/v;->d:Lsa/a;

    .line 6
    iput-object p5, p0, La2/v;->e:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)La2/v;
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
            "Lg2/e;",
            ">;",
            "Lsa/a<",
            "Lh2/r;",
            ">;",
            "Lsa/a<",
            "Lh2/v;",
            ">;)",
            "La2/v;"
        }
    .end annotation

    new-instance v6, La2/v;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, La2/v;-><init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V

    return-object v6
.end method

.method public static c(Lk2/a;Lk2/a;Lg2/e;Lh2/r;Lh2/v;)La2/t;
    .locals 7

    new-instance v6, La2/t;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, La2/t;-><init>(Lk2/a;Lk2/a;Lg2/e;Lh2/r;Lh2/v;)V

    return-object v6
.end method


# virtual methods
.method public b()La2/t;
    .locals 5

    iget-object v0, p0, La2/v;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk2/a;

    iget-object v1, p0, La2/v;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk2/a;

    iget-object v2, p0, La2/v;->c:Lsa/a;

    invoke-interface {v2}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg2/e;

    iget-object v3, p0, La2/v;->d:Lsa/a;

    invoke-interface {v3}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/r;

    iget-object v4, p0, La2/v;->e:Lsa/a;

    invoke-interface {v4}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh2/v;

    invoke-static {v0, v1, v2, v3, v4}, La2/v;->c(Lk2/a;Lk2/a;Lg2/e;Lh2/r;Lh2/v;)La2/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La2/v;->b()La2/t;

    move-result-object v0

    return-object v0
.end method
