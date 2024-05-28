.class public final Lh2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lh2/v;",
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
            "Li2/d;",
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
            "Lj2/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lh2/x;",
            ">;",
            "Lsa/a<",
            "Lj2/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh2/w;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Lh2/w;->b:Lsa/a;

    .line 4
    iput-object p3, p0, Lh2/w;->c:Lsa/a;

    .line 5
    iput-object p4, p0, Lh2/w;->d:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;Lsa/a;)Lh2/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lh2/x;",
            ">;",
            "Lsa/a<",
            "Lj2/b;",
            ">;)",
            "Lh2/w;"
        }
    .end annotation

    new-instance v0, Lh2/w;

    invoke-direct {v0, p0, p1, p2, p3}, Lh2/w;-><init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Li2/d;Lh2/x;Lj2/b;)Lh2/v;
    .locals 1

    new-instance v0, Lh2/v;

    invoke-direct {v0, p0, p1, p2, p3}, Lh2/v;-><init>(Ljava/util/concurrent/Executor;Li2/d;Lh2/x;Lj2/b;)V

    return-object v0
.end method


# virtual methods
.method public b()Lh2/v;
    .locals 4

    iget-object v0, p0, Lh2/w;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lh2/w;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/d;

    iget-object v2, p0, Lh2/w;->c:Lsa/a;

    invoke-interface {v2}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/x;

    iget-object v3, p0, Lh2/w;->d:Lsa/a;

    invoke-interface {v3}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj2/b;

    invoke-static {v0, v1, v2, v3}, Lh2/w;->c(Ljava/util/concurrent/Executor;Li2/d;Lh2/x;Lj2/b;)Lh2/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh2/w;->b()Lh2/v;

    move-result-object v0

    return-object v0
.end method
