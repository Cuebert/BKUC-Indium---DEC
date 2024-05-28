.class public final Lh2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lh2/r;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Landroid/content/Context;",
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
            "Li2/d;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lh2/x;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lj2/b;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Li2/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Lb2/e;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lh2/x;",
            ">;",
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lsa/a<",
            "Lj2/b;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Li2/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh2/s;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Lh2/s;->b:Lsa/a;

    .line 4
    iput-object p3, p0, Lh2/s;->c:Lsa/a;

    .line 5
    iput-object p4, p0, Lh2/s;->d:Lsa/a;

    .line 6
    iput-object p5, p0, Lh2/s;->e:Lsa/a;

    .line 7
    iput-object p6, p0, Lh2/s;->f:Lsa/a;

    .line 8
    iput-object p7, p0, Lh2/s;->g:Lsa/a;

    .line 9
    iput-object p8, p0, Lh2/s;->h:Lsa/a;

    .line 10
    iput-object p9, p0, Lh2/s;->i:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)Lh2/s;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Lb2/e;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lh2/x;",
            ">;",
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lsa/a<",
            "Lj2/b;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Li2/c;",
            ">;)",
            "Lh2/s;"
        }
    .end annotation

    new-instance v10, Lh2/s;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lh2/s;-><init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V

    return-object v10
.end method

.method public static c(Landroid/content/Context;Lb2/e;Li2/d;Lh2/x;Ljava/util/concurrent/Executor;Lj2/b;Lk2/a;Lk2/a;Li2/c;)Lh2/r;
    .locals 11

    new-instance v10, Lh2/r;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, Lh2/r;-><init>(Landroid/content/Context;Lb2/e;Li2/d;Lh2/x;Ljava/util/concurrent/Executor;Lj2/b;Lk2/a;Lk2/a;Li2/c;)V

    return-object v10
.end method


# virtual methods
.method public b()Lh2/r;
    .locals 10

    iget-object v0, p0, Lh2/s;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lh2/s;->b:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lb2/e;

    iget-object v0, p0, Lh2/s;->c:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Li2/d;

    iget-object v0, p0, Lh2/s;->d:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lh2/x;

    iget-object v0, p0, Lh2/s;->e:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lh2/s;->f:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lj2/b;

    iget-object v0, p0, Lh2/s;->g:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lk2/a;

    iget-object v0, p0, Lh2/s;->h:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lk2/a;

    iget-object v0, p0, Lh2/s;->i:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Li2/c;

    invoke-static/range {v1 .. v9}, Lh2/s;->c(Landroid/content/Context;Lb2/e;Li2/d;Lh2/x;Ljava/util/concurrent/Executor;Lj2/b;Lk2/a;Lk2/a;Li2/c;)Lh2/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh2/s;->b()Lh2/r;

    move-result-object v0

    return-object v0
.end method
