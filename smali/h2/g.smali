.class public final synthetic Lh2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lh2/r;


# direct methods
.method public synthetic constructor <init>(Lh2/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/g;->a:Lh2/r;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh2/g;->a:Lh2/r;

    invoke-static {v0}, Lh2/r;->i(Lh2/r;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
