.class public final Lu0/o;
.super Lu0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/o$a;
    }
.end annotation


# static fields
.field public static final b:Lu0/o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu0/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu0/o$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lu0/o;->b:Lu0/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"

    invoke-direct {p0, v0}, Lu0/e;-><init>(Ljava/lang/String;)V

    return-void
.end method
