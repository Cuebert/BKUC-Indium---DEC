.class public final Ln1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/k$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Ln1/k$a;Ln1/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln1/k$a;->c(Ln1/k$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ln1/k;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()Ln1/k$a;
    .locals 2

    new-instance v0, Ln1/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/k$a;-><init>(Ln1/i0;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln1/k;->a:Ljava/lang/String;

    return-object v0
.end method
