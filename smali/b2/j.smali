.class public final Lb2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lb2/i;",
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
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsa/a;Lsa/a;Lsa/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb2/j;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Lb2/j;->b:Lsa/a;

    .line 4
    iput-object p3, p0, Lb2/j;->c:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;)Lb2/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;)",
            "Lb2/j;"
        }
    .end annotation

    new-instance v0, Lb2/j;

    invoke-direct {v0, p0, p1, p2}, Lb2/j;-><init>(Lsa/a;Lsa/a;Lsa/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lk2/a;Lk2/a;)Lb2/i;
    .locals 1

    new-instance v0, Lb2/i;

    invoke-direct {v0, p0, p1, p2}, Lb2/i;-><init>(Landroid/content/Context;Lk2/a;Lk2/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lb2/i;
    .locals 3

    iget-object v0, p0, Lb2/j;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lb2/j;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk2/a;

    iget-object v2, p0, Lb2/j;->c:Lsa/a;

    invoke-interface {v2}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk2/a;

    invoke-static {v0, v1, v2}, Lb2/j;->c(Landroid/content/Context;Lk2/a;Lk2/a;)Lb2/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb2/j;->b()Lb2/i;

    move-result-object v0

    return-object v0
.end method
