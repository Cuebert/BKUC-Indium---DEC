.class public final synthetic Lja/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/h;


# instance fields
.field public final synthetic a:Lja/j$b;


# direct methods
.method public synthetic constructor <init>(Lja/j$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/i;->a:Lja/j$b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lja/i;->a:Lja/j$b;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Lja/j;->b(Lja/j$b;Ljava/lang/Void;)V

    return-void
.end method
