.class public final Li2/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Li2/t0;",
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Ljava/lang/Integer;",
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
            "Ljava/lang/String;",
            ">;",
            "Lsa/a<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li2/u0;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Li2/u0;->b:Lsa/a;

    .line 4
    iput-object p3, p0, Li2/u0;->c:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;)Li2/u0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Ljava/lang/String;",
            ">;",
            "Lsa/a<",
            "Ljava/lang/Integer;",
            ">;)",
            "Li2/u0;"
        }
    .end annotation

    new-instance v0, Li2/u0;

    invoke-direct {v0, p0, p1, p2}, Li2/u0;-><init>(Lsa/a;Lsa/a;Lsa/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Li2/t0;
    .locals 1

    new-instance v0, Li2/t0;

    invoke-direct {v0, p0, p1, p2}, Li2/t0;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Li2/t0;
    .locals 3

    iget-object v0, p0, Li2/u0;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Li2/u0;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Li2/u0;->c:Lsa/a;

    invoke-interface {v2}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Li2/u0;->c(Landroid/content/Context;Ljava/lang/String;I)Li2/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li2/u0;->b()Li2/t0;

    move-result-object v0

    return-object v0
.end method
