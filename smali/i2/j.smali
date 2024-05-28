.class public final Li2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Li2/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Li2/j;
    .locals 1

    invoke-static {}, Li2/j$a;->a()Li2/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Li2/e;
    .locals 2

    invoke-static {}, Li2/f;->d()Li2/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lc2/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/e;

    return-object v0
.end method


# virtual methods
.method public b()Li2/e;
    .locals 1

    invoke-static {}, Li2/j;->c()Li2/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li2/j;->b()Li2/e;

    move-result-object v0

    return-object v0
.end method
