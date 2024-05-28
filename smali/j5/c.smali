.class public final synthetic Lj5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj5/c;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lj5/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj5/c;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Lj5/d;->b(Ljava/lang/Object;Lj5/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
