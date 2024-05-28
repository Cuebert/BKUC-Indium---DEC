.class public final synthetic Lja/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/g;


# instance fields
.field public final synthetic a:Lja/j$b;


# direct methods
.method public synthetic constructor <init>(Lja/j$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/f;->a:Lja/j$b;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lja/f;->a:Lja/j$b;

    invoke-static {v0, p1}, Lja/j;->a(Lja/j$b;Ljava/lang/Exception;)V

    return-void
.end method
